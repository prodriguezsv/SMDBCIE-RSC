package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: IsRootTaxon
* @author ontology bean generator
* @version 2009/10/17, 19:00:46
*/
public class DefaultIsRootTaxon implements IsRootTaxon, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 1907932705116471396L;

  private String _internalInstanceName = null;

  public DefaultIsRootTaxon() {
    this._internalInstanceName = "";
  }

  public DefaultIsRootTaxon(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: taxon
   */
   private Taxon taxon;
   public void setTaxon(Taxon value) { 
     pcs.firePropertyChange("taxon", (this.taxon==null?new Taxon():this.taxon), value);
    this.taxon=value;
   }
   public Taxon getTaxon() {
     return this.taxon;
   }

}
