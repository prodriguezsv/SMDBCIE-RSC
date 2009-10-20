package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: EnvironmentalCategory
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface EnvironmentalCategory extends DefinedTerm, Introspectable {

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
