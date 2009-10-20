package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: AppliesTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface AppliesTo extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

   /**
   * Protege name: descriptiveElement
   */
   public void setDescriptiveElement(Object value);
   public Object getDescriptiveElement();

}
