package edu.stanford.cs108.bunnyworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Vector;

public class Page extends AppCompatActivity {

    private Vector<Page> accessiblePages;
    private Vector<Page> referencedPages;
    private View screen;
    private Vector shape;
    private String name;

    public Page(){
        accessiblePages = null;
        referencedPages = null;
        shape = null;
    }

    private void setName(String given){
        name = given;
    }

    private String getName(){
        return name;
    }

    private void addAccessiblePage(Page added){
        accessiblePages.add(added);
    }

    private void removeAccessiblePages(String removed){
        for(int i = 0; i < accessiblePages.size(); i++){
            if(removed == name){
                accessiblePages.remove(i);
            }
        }

    }

    private int accessiblePageslength(){
        return accessiblePages.size();
    }


    private void addReferencedPages(Page referenced){
        referencedPages.add(referenced);
    }

    private void removeReferencedPages(String removed){
        for(int i = 0; i < referencedPages.size(); i++){
            if(removed == name){
                referencedPages.remove(i);
            }
        }
    }

    private int referencedPageslength(){
        return referencedPages.size();
    }

    private void addShape(Shape s){
        shape.add(s);
    }

    private int shapesLength(){
        return shape.size();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);
    }
}
