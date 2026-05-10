/* (C)2026 */
package catcafe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatCafeTest {

    private CatCafe cafe;

    @BeforeEach
    void setUp() {
        cafe = new CatCafe();
    }

    @Test
    void testAddCat() {
        // given
        FelineOverLord cat = new FelineOverLord("Fluffer the Second", 4);

        // when
        cafe.addCat(cat);

        // then
        assertEquals(cat, cafe.getCatByName(cat.name()));
    }

    @Test
    void testGetCatCount() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);

        // then
        assertEquals(3, cafe.getCatCount());
    }

    @Test
    void testEmptyGetCatCount() {
        // given
        // when
        // then
        assertEquals(0, cafe.getCatCount());
    }

    @Test
    void testGetCatByName() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);

        // then
        assertEquals(cat2, cafe.getCatByName(cat2.name()));
    }

    @Test
    void testGetNoCatByName() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);

        // then
        assertNull(cafe.getCatByName("Herbert"));
    }

    @Test
    void testEmptyGetCatByName() {
        // given
        // when
        // then
        assertNull(cafe.getCatByName(""));
    }

    @Test
    void testFirstGetCatByName() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Phil", 8);
        FelineOverLord cat4 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);
        cafe.addCat(cat4);

        // then
        assertEquals(cat2, cafe.getCatByName(cat2.name()));
    }

    @Test
    void testGetFirstCatByMinWeigth() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Phil", 8);
        FelineOverLord cat4 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);
        cafe.addCat(cat4);

        // then
        assertEquals(cat1, cafe.getCatByWeight(4, 10));
    }

    @Test
    void testGetCatByMaxWeigth() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Phil", 8);
        FelineOverLord cat4 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);
        cafe.addCat(cat4);

        // then
        assertEquals(cat3, cafe.getCatByWeight(6, 9));
    }

    @Test
    void testGetNoCatByWeight() {
        // given
        FelineOverLord cat1 = new FelineOverLord("Fluffer the Second", 4);
        FelineOverLord cat2 = new FelineOverLord("Phil", 2);
        FelineOverLord cat3 = new FelineOverLord("Phil", 8);
        FelineOverLord cat4 = new FelineOverLord("Rufus von Hohenzollern", 5);

        // when
        cafe.addCat(cat1);
        cafe.addCat(cat2);
        cafe.addCat(cat3);
        cafe.addCat(cat4);

        // then
        assertNull(cafe.getCatByWeight(6, 8));
    }
}
