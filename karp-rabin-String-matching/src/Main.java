public class Main {
//karp-rabin is method to find the string matching in the string
       //this alogorithm check the hash value of the string A with the string B if we want to find the value of A in the B we only search in the range of length of string which we are finding in the another string
       // h(a)=h(b)[i:i+length(a)];
    // may be we found a match their is small posiblity that the two string has a same hashvalue

    public static void main(String[] args) {
karp_rabin kr=new karp_rabin();
kr.search("AryanAbhinavAbhay","Abhinav");
    }
}