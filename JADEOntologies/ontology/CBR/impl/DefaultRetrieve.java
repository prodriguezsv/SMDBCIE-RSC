package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: Retrieve
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultRetrieve implements Retrieve, Serializable {
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

  public DefaultRetrieve() {
    this._internalInstanceName = "";
  }

  public DefaultRetrieve(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: similarTo
   */
   private Problem similarTo;
   public void setSimilarTo(Problem value) { 
     pcs.firePropertyChange("similarTo", (this.similarTo==null?new Problem():this.similarTo), value);
    this.similarTo=value;
   }
   public Problem getSimilarTo() {
     return this.similarTo;
   }

}
