package Internal.Algorithms.Graph.Utils;

import Internal.Algorithms.Graph.Utils.AdjList.DirectedGraph;
import Internal.Algorithms.IO.GraphFileReader;
import org.jgrapht.alg.util.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SimMatTest {
    private SimMat simMat;

    @BeforeEach
    void init() throws IOException {
        GraphFileReader reader = new GraphFileReader(true,true,false);
        DirectedGraph directedGraph1 = reader.readToDirectedGraph("src/test/java/resources/AlgTest/HGA/graph1.txt",false);
        DirectedGraph directedGraph2 = reader.readToDirectedGraph("src/test/java/resources/AlgTest/HGA/graph2.txt",false);
        reader.setRecordNonZeros(true);
        reader.setRecordNeighbors(false);
        simMat = reader.readToSimMat("src/test/java/resources/AlgTest/HGA/simMat.txt", directedGraph1.getAllNodes(), directedGraph2.getAllNodes(),true);
    }
    @DisplayName("split")
    @Test
    void getSplit() {

        Pair<SimMat,SimMat> res = simMat.getSplit(5);
    }
    @DisplayName("sum mat")
    @Test
    void sum(){
       //assertEquals(simMat.getMat().sum(),simMat.sum());
    }
    @DisplayName("getPart")
    @Test
    void getPart(){
        HashSet<String> cols = new HashSet<>(Arrays.asList("H", "F", "I", "Q"));
        HashSet<String> rows = new HashSet<>(Arrays.asList("A", "B"));
        SimMat res = simMat.getPart(rows,cols);
        assertEquals(rows,res.getRowSet());
        assertEquals(cols,res.getColSet());

    }
}