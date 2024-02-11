package A2ZDSA.Hashing;

public class FrequencyArryForString {
    //Charater to check
    char[] ch={'b','a','d'};
    public static void main(String args[])
    {
        String str = "gauravb";
        FrequencyArryForString fa = new FrequencyArryForString();
        fa.freqArray(str);
    }
    public void freqArray(String s)
    {
        int hash[] =new int[256];
        for(int i=0;i<s.length();i++)
            hash[s.charAt(i)]++;
        //PrintArray
        for(int i=0;i<ch.length;i++)
            System.out.println(ch[i]+" == "+hash[ch[i]]);
    }

}
