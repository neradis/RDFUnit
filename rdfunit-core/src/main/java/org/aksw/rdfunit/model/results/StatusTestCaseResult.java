package org.aksw.rdfunit.model.results;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.DCTerms;
import com.hp.hpl.jena.vocabulary.RDF;
import org.aksw.rdfunit.enums.TestCaseResultStatus;
import org.aksw.rdfunit.model.interfaces.TestCase;
import org.aksw.rdfunit.vocabulary.RDFUNITv;


/**
 * The Status test case result.
 *
 * @author Dimitris Kontokostas
 * @since 1 /6/14 3:26 PM
 * @version $Id: $Id
 */
public class StatusTestCaseResult extends TestCaseResult {
    private final TestCaseResultStatus status;

    /**
     * Instantiates a new Status test case result.
     *
     * @param testCase the test case
     * @param status   the status
     */
    public StatusTestCaseResult(TestCase testCase, TestCaseResultStatus status) {
        super(testCase);
        this.status = status;
    }

    /** {@inheritDoc} */
    @Override
    public Resource serialize(Model model, String testExecutionURI) {
        return super.serialize(model, testExecutionURI)
                .addProperty(RDF.type, RDFUNITv.StatusTestCaseResult)
                .addProperty(RDFUNITv.resultStatus, model.createResource(getStatus().getUri()))
                .addProperty(DCTerms.description, getTestCase().getResultMessage())
                .addProperty(RDFUNITv.testCaseLogLevel, model.createResource(getTestCase().getLogLevel().getUri()))
                ;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public TestCaseResultStatus getStatus() {
        return status;
    }
}