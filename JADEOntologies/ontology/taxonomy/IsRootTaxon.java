package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: IsRootTaxon
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface IsRootTaxon extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: taxon
   */
   public void setTaxon(Taxon value);
   public Taxon getTaxon();

}
