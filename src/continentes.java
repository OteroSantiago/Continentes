
public enum continentes {
    AFRICA(53),
    EUROPA(34),
    ASIA(46),
    AMERICA(44),
    OCEANIA(14);
    
    private final int numPaises; 
    
    continentes(int numPaises){
        this.numPaises= numPaises;
    }
    
    public int getNumPaises(){
        return this.numPaises;
    }
}

