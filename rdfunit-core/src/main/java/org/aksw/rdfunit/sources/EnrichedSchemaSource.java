package org.aksw.rdfunit.sources;

import org.aksw.rdfunit.enums.TestAppliesTo;
import org.aksw.rdfunit.io.DataReader;

/**
 * User: Dimitris Kontokostas
 * Description
 * Created: 9/16/13 1:53 PM
 */
public class EnrichedSchemaSource extends SchemaSource {

    public EnrichedSchemaSource(String prefix, String uri, DataReader schemaReader) {
        super(prefix, uri, schemaReader);
    }

    @Override
    public TestAppliesTo getSourceType() {
        return TestAppliesTo.EnrichedSchema;
    }

    @Override
    public String getPrefix() {
        return "enriched-" + super.getPrefix();
    }

    public void enrichDataset() {
        enrichDataset(0.9);
    }

    //TODO enrich
    // call default DLLearner's output
    public void enrichDataset(double confidence) {

    }

}