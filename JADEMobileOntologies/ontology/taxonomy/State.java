package ontology.taxonomy;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* It's a subclass of a defined term
* Protege name: State
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public interface State extends DefinedTerm, Introspectable {

   /**
   * Protege name: describes
   */
   public void addDescribes(Attribute elem);
   public boolean removeDescribes(Attribute elem);
   public void clearAllDescribes();
   public Iterator getAllDescribes();
   public List getDescribes();
   public void setDescribes(List l);

}
