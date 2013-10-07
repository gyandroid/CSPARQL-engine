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
/*
 * @(#)CSparqlQuery.java   1.0   Sep 14, 2009
 *
 * Copyright 2009-2009 Politecnico di Milano. All Rights Reserved.
 *
 * This software is the proprietary information of Politecnico di Milano.
 * Use is subject to license terms.
 *
 * @(#) $Id: CSparqlQuery.java 119 2009-09-30 09:55:20Z dbarbieri $
 */
package eu.larkc.csparql.core.streams.formats;

import java.util.Collection;

import eu.larkc.csparql.cep.api.CepQuery;
import eu.larkc.csparql.common.NamedObject;
import eu.larkc.csparql.core.parser.StreamInfo;
import eu.larkc.csparql.core.parser.TreeBox;
import eu.larkc.csparql.sparql.api.SparqlQuery;

public interface CSparqlQuery extends NamedObject {

   String getQueryCommand();

   CepQuery getCepQuery();

   SparqlQuery getSparqlQuery();

   void setTreeBox(TreeBox tb);

   TreeBox getTreeBox();
   
   Collection<StreamInfo> getStreams();
}
