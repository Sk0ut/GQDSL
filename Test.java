/**
 * Created by Afonso on 06/06/2016.
 */
public class Test {


    static void main(String[] args){
        String filepath = "testfile.rdf";

        QUERY(filepath,result): SELECT * WHERE {
            ?person v:label "person".
                    ?person v:name ?name.
                    ?person v:age ?age
        }

        }
    }

