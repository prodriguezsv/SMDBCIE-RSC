package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Modifier
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
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
