package ServiceImpl;

import service.PalindromoService;

public class PalindromoServiceImpl implements PalindromoService {

    @Override
    public String toPalindromo(String palabra) {
        StringBuilder reverse = new StringBuilder();
        for (int i = palabra.length()-1; i>=0;i--){
            reverse.append(palabra.charAt(i));
        }
        return reverse.toString();
    }
}
