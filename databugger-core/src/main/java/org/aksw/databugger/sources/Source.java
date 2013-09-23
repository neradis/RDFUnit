package org.aksw.databugger.sources;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * User: Dimitris Kontokostas
 * Abstract class for a data source. A source can be various things like a dataset, a vocabulary or an application
 * Date: 9/16/13 1:15 PM
 */

public abstract class Source {
    public final String uri;
    public final Model model = ModelFactory.createDefaultModel();

    public Source(String uri) {
        this.uri = uri;
    }
}
