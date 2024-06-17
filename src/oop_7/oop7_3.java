package oop_7;

class Product{
    int price;
    int bonusPoint;

    Product(){} // 기본 생성자가 없었기 떄문에 오류가 발생했음

    Product(int price){
        this.price=price;
        bonusPoint=(int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){}
    public String toString(){
        return "Tv";
    }
}

class oop7_3{
    public static void main(String[] args) {
        Tv t=new Tv();
    }
}
