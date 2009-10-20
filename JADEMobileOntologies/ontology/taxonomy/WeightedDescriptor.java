package ontology.taxonomy;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public interface WeightedDescriptor extends jade.content.Concept, Introspectable {

   /**
   * Protege name: descriptor
   */
   public void setDescriptor(Descriptor value);
   public Descriptor getDescriptor();

   /**
   * Protege name: modifier
   */
   public void setModifier(Modifier value);
   public Modifier getModifier();

}
