package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Description
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Description extends jade.content.Concept, Introspectable {

   /**
   * Protege name: descriptors
   */
   public void addDescriptors(Descriptor elem);
   public boolean removeDescriptors(Descriptor elem);
   public void clearAllDescriptors();
   public Iterator getAllDescriptors();
   public List getDescriptors();
   public void setDescriptors(List l);

}
