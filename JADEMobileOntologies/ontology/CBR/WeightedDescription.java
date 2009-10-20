package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: WeightedDescription
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface WeightedDescription extends jade.content.Concept, Introspectable {

   /**
   * Protege name: weightedDescriptors
   */
   public void addWeightedDescriptors(WeightedDescriptor elem);
   public boolean removeWeightedDescriptors(WeightedDescriptor elem);
   public void clearAllWeightedDescriptors();
   public Iterator getAllWeightedDescriptors();
   public List getWeightedDescriptors();
   public void setWeightedDescriptors(List l);

}
