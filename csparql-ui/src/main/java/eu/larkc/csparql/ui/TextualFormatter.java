/*******************************************************************************
 * Copyright 2013 Davide Barbieri, Emanuele Della Valle, Marco Balduini
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Acknowledgements:
 * 
 * This work was partially supported by the European project LarKC (FP7-215535)
 ******************************************************************************/
package eu.larkc.csparql.ui;

import java.util.Observable;

import eu.larkc.csparql.core.ResultFormatter;

public class TextualFormatter extends ResultFormatter {

	private final int count = 0;
	private long start = 0;


	//   public void update(final GenericObservable<RDFTable> observed, final RDFTable q) {
	//
	//      // System.out.println(q.toString());
	//
	//      if (this.start == 0) {
	//         this.start = System.nanoTime();
	//      }
	//
	//      //for (final RDFTuple t : q.) {
	////         System.out.println(q.toString());
	//   }
	//   //}


	@Override
	public void update(Observable o, Object arg) {
		if (this.start == 0) {
			this.start = System.nanoTime();
		}

	}
}
