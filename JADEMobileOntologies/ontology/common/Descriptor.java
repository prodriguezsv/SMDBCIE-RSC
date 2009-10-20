package ontology.common;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Descriptor
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public interface Descriptor extends jade.content.Concept, Introspectable {

   /**
   * Protege name: score
   */
   public void addScore(Object elem);
   public boolean removeScore(Object elem);
   public void clearAllScore();
   public Iterator getAllScore();
   public List getScore();
   public void setScore(List l);

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

   /**
   * Protege name: structure
   */
   public void setStructure(Object value);
   public Object getStructure();

}
