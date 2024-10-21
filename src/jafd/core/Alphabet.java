package jafd.core;

import java.util.HashMap;
import java.util.Map;
import jafd.exceptions.MachineException;

public class Alphabet {
    private final Map<String, String> symbols;

    public Alphabet() {
        this.symbols = new HashMap<String, String>();
    }    

    public void addSymbols(final String[] symbols) throws MachineException {        
        for (String symbol: symbols) {
            if (symbol.length() == 1) {
                addSymbol(symbol.toLowerCase());
            } else {
                throw new MachineException("The length of a symbol can't be greater than 1.");
            }           
        }
    }
    
    public boolean belongs(final char symbol) {
        return symbols.containsKey(String.valueOf(symbol));
    }    
    
 void addSymbol(String symbol) {
        symbols.put(symbol, symbol);
    }

    public Map<String, String> getSymbols() {
        return symbols;
    }
    
    @Override
    public String toString() {
        return symbols.toString();
    }

}
