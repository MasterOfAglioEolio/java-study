package oop_7;

import java.util.Arrays;

class SutdaDeck{
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){

        for(int i=0;i<cards.length;i++){
            int num=i%10+1;
            if(i<10) {
                if (num == 1 || num == 3 || num == 8) {
                    boolean isKwang = true;
                    cards[i]=new SutdaCard(num,isKwang);
                }
                else{
                    boolean isKwang = false;
                    cards[i]=new SutdaCard(num,isKwang);
                }

            }
            else if(i>=10)
            {
                boolean isKwang = false;
                cards[i]=new SutdaCard(num,isKwang);
            }
        }

    }

    void shuffle(){

        if(cards.length==0){
            System.out.println("isnull");
        }
        for(int i=0;i<cards.length;i++){
            SutdaCard temp;
            int rand_num;

            temp=cards[i];
            rand_num=(int)(Math.random()*cards.length);
//            System.out.println(rand_num);
            cards[i]=cards[rand_num];
            cards[rand_num]=temp;
        }


    }
    SutdaCard pick(int index){

        return cards[index];
    }
    SutdaCard pick(){
        int rand_index=(int) (Math.random()*cards.length);
        return cards[rand_index];
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String toString(){
        return num+(isKwang?"K":"");
    }
}

//class Exercise7_1{
//    public static void main(String[] args) {
//        SutdaDeck deck = new SutdaDeck();
//
//        for(int i =0; i< deck.cards.length;i++){
//            System.out.print(deck.cards[i]+",");
//        }
//    }
//}

class Exercise7_2{
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i =0; i< deck.cards.length;i++){
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}