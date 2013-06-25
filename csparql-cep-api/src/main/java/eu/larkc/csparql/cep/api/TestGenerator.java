/*
 * @(#)TestGenerator.java   1.0   18/set/2009
 *
 * Copyright 2009-2009 Politecnico di Milano. All Rights Reserved.
 *
 * This software is the proprietary information of Politecnico di Milano.
 * Use is subject to license terms.
 *
 * @(#) $Id$
 */
package eu.larkc.csparql.cep.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestGenerator extends RdfStream implements Runnable {

	/** The logger. */
	protected final Logger logger = LoggerFactory
			.getLogger(TestGenerator.class);	
	
   private int c = 1;
   private boolean keepRunning = false;

   public TestGenerator(final String iri) {
      super(iri);
   }
   
   public void pleaseStop() {
	   keepRunning = false;
   }

   public void run() {
	  keepRunning = true;
      while (keepRunning) {
    	  
    	 long start = System.nanoTime();
//         final RdfQuadruple q = new RdfQuadruple("http://myexample.org/S" + this.c,
//               "http://myexample.org/P" + this.c, "http://myexample.org/O" + this.c, this.c);
         final RdfQuadruple q = new RdfQuadruple("http://myexample.org/S" + this.c,
                 "http://myexample.org/P" + this.c, "http://myexample.org/O" + this.c, System.nanoTime());
         
         long end = System.nanoTime();
         long duration = end-start;
//         if(c%10==0) logger.info(c+ " triples streamed so far");
         if ((duration)>1000000) logger.info(((float) c)/((float) duration)*1000000 + " triples/second streamed so far");
         
         this.put(q);
//         try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
         this.c++;
      }
   }
}