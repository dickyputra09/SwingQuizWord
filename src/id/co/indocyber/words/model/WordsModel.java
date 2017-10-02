/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.words.model;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class WordsModel {
    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;

    public WordsModel() {
    }

    public WordsModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint; 
    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
    
    public String createSoal() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
                
        Arrays.sort(arrayOfWord);
        StringBuilder sb = new StringBuilder(); // untuk mengolah array menjadi acak
        System.out.print("\nSetelah disort\n");
        for (int i = 0; i < arrayOfWord.length; i++) {
                System.out.println(arrayOfWord[i]);
                
                sb.append(arrayOfWord[i]);  
            }
        String soal = sb.toString();
        return soal;
    }
    
    public boolean cekJawaban() {
        boolean hasil = false;
        if(getJawaban().equalsIgnoreCase(basicWord)) {
            hasil = true;
        }
        return hasil;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    
    
    
    
}
