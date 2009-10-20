package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface WeightedDescriptor extends jade.content.Concept, Introspectable {

   /**
   * Protege name: modifier
   */
   public void setModifier(Modifier value);
   public Modifier getModifier();

   /**
   * Protege name: descriptor
   */
   public void setDescriptor(Descriptor value);
   public Descriptor getDescriptor();

}
