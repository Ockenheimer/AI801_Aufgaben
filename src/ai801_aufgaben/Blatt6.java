/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import com.sun.org.apache.xml.internal.security.keys.content.KeyInfoContent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author markusschaefer
 * @param <Character>
 */
public class Blatt6 {

    public Blatt6() {
    }
    Node root;

    public static class Node {

        Node links;
        Node rechts;

        char Value;

        public Node(char Value) {
            this.Value = Value;
          

        }

        @Override
        public String toString() {
            return "Value: " + Value + ", links: " + links + ", rechts: " + rechts +";;";
        }

    }

    public void hinzufuegen(char buchstabe) {
        Node knoten;
        if (root != null) {

            knoten = suchen(buchstabe, root);

            if (buchstabe <= knoten.Value) {
                Node linkstemp = new Node(buchstabe);
                knoten.links = linkstemp;
               
            } else {
                Node rechtstemp = new Node(buchstabe);
                knoten.rechts = rechtstemp;
            }
        } else {
            root = new Node(buchstabe);
        }
    }

    public Node suchen(char buchstabe, Node knoten) {
        if (knoten != null) {
            if (buchstabe < knoten.Value) {
                if (knoten.links != null) {
                    knoten = suchen(buchstabe, knoten.links);
                } else {return knoten;}
            } else {
                if (knoten.rechts != null) {

                    knoten = suchen(buchstabe, knoten.rechts);
                }else{ return knoten;}
            }
        }
        return knoten;
    }

}
