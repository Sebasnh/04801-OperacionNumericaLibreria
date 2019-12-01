/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

        double result;

        result = UtilesPrimitivos.operar(UtilesPrimitivos.N1, UtilesPrimitivos.N2, UtilesPrimitivos.OP_MAY);

        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");

        System.out.printf("Número 1 ....: %d%n",
                UtilesPrimitivos.N1);
        System.out.printf("Número 2 ....: %d%n",
                UtilesPrimitivos.N2);

        System.out.println("---");

        System.out.printf("El MAYOR es .: %d%n",
                (int) result);

    }

}
