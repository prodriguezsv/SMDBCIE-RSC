package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: IsSheetTaxon
* @author ontology bean generator
* @version 2009/10/17, 19:00:46
*/
public interface IsSheetTaxon extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: taxon
   */
   public void setTaxon(Taxon value);
   public Taxon getTaxon();

}
