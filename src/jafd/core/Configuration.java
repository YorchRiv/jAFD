
package jafd.core;

import jafd.exceptions.MachineException;

public class Configuration {
    private final Alphabet alphabet;
    private String word;    
    private int headPosition;
    

    public Configuration(Alphabet alphabet){
        this.alphabet = alphabet;        
    }
    
    /*
     * Métodos
     */
    public void enterWord(String word) throws MachineException {        
        if(belongsToAlphabet(word)) {            
            this.word = word;
        } else {
            throw new MachineException("Verifique la cadena ingresada");            
        }                        
    }
    
    public boolean belongsToAlphabet(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!alphabet.belongs(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public String getWord() {
        return word;
    }

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public int getHeadPosition() {
        return headPosition;
    }

    public void setHeadPosition(int headPosition) {
        this.headPosition = headPosition;
    }    
}
