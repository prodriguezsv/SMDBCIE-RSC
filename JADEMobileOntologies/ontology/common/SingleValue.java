package ontology.common;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: SingleValue
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public interface SingleValue extends Value, Introspectable {

   /**
   * Protege name: value
   */
   public void setValue(float value);
   public float getValue();

}
