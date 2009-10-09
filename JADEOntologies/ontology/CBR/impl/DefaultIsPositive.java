package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: IsPositive
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultIsPositive implements IsPositive, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -192457562360579226L;

  private String _internalInstanceName = null;

  public DefaultIsPositive() {
    this._internalInstanceName = "";
  }

  public DefaultIsPositive(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: case
   */
   private Case case;
   public void setCase(Case value) { 
     pcs.firePropertyChange("case", (this.case==null?new Case():this.case), value);
    this.case=value;
   }
   public Case getCase() {
     return this.case;
   }

}
