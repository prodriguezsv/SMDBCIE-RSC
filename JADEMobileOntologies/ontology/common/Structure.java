package ontology.common;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* It's a subclass of a defined term
* Protege name: Structure
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public interface Structure extends DefinedTerm, Introspectable {

   /**
   * Protege name: owns
   */
   public void addOwns(Attribute elem);
   public boolean removeOwns(Attribute elem);
   public void clearAllOwns();
   public Iterator getAllOwns();
   public List getOwns();
   public void setOwns(List l);

}
