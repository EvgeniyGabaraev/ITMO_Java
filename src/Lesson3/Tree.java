package Lesson3;

public class Tree {
    private int age;
    private boolean isLive;
    private String treeType;

    public Tree (int age, String treeType){
        this.age = age;
        this.treeType = treeType;
    }

    public Tree (int age, boolean isLive, String treeType){
        this.age = age;
        this.isLive = isLive;
        this.treeType = treeType;
    }

    public Tree (){
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
