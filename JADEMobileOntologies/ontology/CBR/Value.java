package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Value
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Value extends jade.content.Concept, Introspectable {

   /**
   * Protege name: describes
   */
   public void addDescribes(Attribute elem);
   public boolean removeDescribes(Attribute elem);
   public void clearAllDescribes();
   public Iterator getAllDescribes();
   public List getDescribes();
   public void setDescribes(List l);

   /**
   * Protege name: measuringUnit
   */
   public void setMeasuringUnit(String value);
   public String getMeasuringUnit();

}
