package ontology.taxonomy;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: DescribedBy
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public interface DescribedBy extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

   /**
   * Protege name: score
   */
   public void addScore(Object elem);
   public boolean removeScore(Object elem);
   public void clearAllScore();
   public Iterator getAllScore();
   public List getScore();
   public void setScore(List l);

}
