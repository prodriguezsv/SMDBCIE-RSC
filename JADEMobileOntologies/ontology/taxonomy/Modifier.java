package ontology.taxonomy;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Modifier
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public interface Modifier extends jade.content.Concept, Introspectable {

   /**
   * Protege name: structureWeight
   */
   public void setStructureWeight(float value);
   public float getStructureWeight();

   /**
   * Protege name: attributeWeight
   */
   public void setAttributeWeight(float value);
   public float getAttributeWeight();

   /**
   * Protege name: scoreWeight
   */
   public void setScoreWeight(float value);
   public float getScoreWeight();

}
