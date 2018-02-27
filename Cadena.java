public class Cadena {
    
    String palabra;
    
    public void setPalabra(String p)
    {
        palabra=p;
    }
    public int TamañoPalabra()
    {
        return palabra.length();
    }
    
    public boolean Palindrome()
    {
        String pal="";
        
        for (int x=palabra.length()-1;x>=0;x--)
		pal = pal + palabra.charAt(x);
        
        if (pal.equals(palabra))
            return true;
        else
            return false;
        
    }
    
}
