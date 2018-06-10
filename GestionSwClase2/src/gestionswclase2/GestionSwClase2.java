
package gestionswclase2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class GestionSwClase2 {

    
    public static void main(String[] args) throws IOException {
       InputStream tokenModelIn = null;
        InputStream posModelIn = null;

        String sentence = "If you told me, your secret would be kept"; // Model loading failed, handle the error
        String s1 = "";
        boolean estado= false;
        String s2 = "";
        char[] prueba = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            if(prueba[i] == ',' ){
                estado= true;
            }
            if (!estado) {
                s1+= prueba[i];
            }else
            {
                s2+= prueba[i];
            }
        }
        if (estado) {
            String s3 = Validar(s1);
            String s4 = Validar(s2);
            System.out.println(s3);
            System.out.println(s4);
        }
        else{
            String s3=Validar(s1);
            System.out.println(s3);
        }
    }
    
    public  static String Validar(String frase) throws FileNotFoundException, IOException{
        
          InputStream tokenModelIn = null;
        InputStream posModelIn = null;
                   // tokenize the sentence
                tokenModelIn = new FileInputStream("C:\\Users\\Leonardo-PC\\Documents\\Repositorio\\EIS\\GestionSwClase2\\src\\en-token.bin");
                TokenizerModel tokenModel = new TokenizerModel(tokenModelIn);
                Tokenizer tokenizer = new TokenizerME(tokenModel);
                String tokens[] = tokenizer.tokenize(frase);
                
                for (String token : tokens) {
                    System.out.println(token);
            }

                // Parts-Of-Speech Tagging
                // reading parts-of-speech model to a stream 
                posModelIn = new FileInputStream("C:\\Users\\Leonardo-PC\\Documents\\Repositorio\\EIS\\GestionSwClase2\\src\\en-pos-maxent.bin");
                // loading the parts-of-speech model from stream
                POSModel posModel = new POSModel(posModelIn);
                // initializing the parts-of-speech tagger with model 
                POSTaggerME posTagger = new POSTaggerME(posModel);
                // Tagger tagging the tokens
                String tags[] = posTagger.tag(tokens);
                // Getting the probabilities of the tags given to the tokens
                double probs[] = posTagger.probs();

                System.out.println("Token\t:\tTag\t:\tProbability\n---------------------------------------------");
                for(int i=0;i<tokens.length;i++){
                        System.out.println(tokens[i]+"\t:\t"+tags[i]+"\t:\t"+probs[i]);
                }
                boolean bandera1 = false; 
                boolean bandera2 = false; 
                // determinar voz activa 
                for (int i = 0; i < tags.length; i++) {
                bandera1 = ((tags[i].equals("PRP") ) || (tags[i].equals("NNP")) || (tags[i].equals("NN"))); 
                bandera2 = ((tags[i].equals("VBP")) || (tags[i].equals("VBZ")) || (tags[i].equals("VBD")) || (tags[i].equals("VBN")) 
                                    ||(tags[i].equals("VB"))  || (tags[i].equals("PRP$"))
                        );
                
                if (bandera1 ) {
                   // System.out.println("Probablemente activa");
                    break; 
                }
                
                 if (bandera2 ) {
                   // System.out.println("Probablemente pasiva");
                    break; 
                }
             
            }
              boolean bandera3 = false; 
              boolean bandera4 = false; 
              for (int i = 0; i < tags.length; i++) {
                bandera3 = ((tags[i].equals("VBP")  || tags[i].equals("VBN") || tags[i].equals("VBZ")  || tags[i].equals("VBD") || tags[i].equals("VBG") &&
                                tags[i+1].equals("VBP")  || tags[i+1].equals("VBN") || tags[i+1].equals("VBZ")  || tags[i+1].equals("VBD") || tags[i+1].equals("VBG"))
                        ); 
                if(bandera3){
                    //System.out.println("Probablemente pasiva");
                    break; 
                }
               }
              if(bandera1){
                 return "Activa";
              }
              else  if(bandera2!=bandera3){
                  System.out.println("No puedo determinar si es activa o pasiva");
                  if(bandera3){
                      return "Pero probablemente es pasiva";
                  }
              }else{
                  return "Pasiva";
              }
              return ""; 
    }
    
}
