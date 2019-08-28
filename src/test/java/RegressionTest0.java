import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.journaldev.jackson.json.JacksonStreamingReadExample jacksonStreamingReadExample0 = new com.journaldev.jackson.json.JacksonStreamingReadExample();
        try {
            jacksonStreamingReadExample0.meoq();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: employee.txt (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        java.lang.String str2 = employee0.getRole();
        java.lang.String str3 = employee0.getName();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.journaldev.jackson.json.Main main0 = new com.journaldev.jackson.json.Main();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.journaldev.jackson.json.JacksonStreamingWriteExample jacksonStreamingWriteExample0 = new com.journaldev.jackson.json.JacksonStreamingWriteExample();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        employee0.setProperties(strMap9);
        boolean boolean11 = employee0.isPermanent();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        employee0.setCities((java.util.List<java.lang.String>) strList12);
        employee0.setPermanent(true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        java.lang.String str2 = employee0.getRole();
        employee0.setRole("2.5");
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        employee0.setId((int) (byte) 100);
        boolean boolean4 = employee0.isPermanent();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        com.journaldev.jackson.model.Address address1 = null;
        employee0.setAddress(address1);
        java.lang.String str3 = employee0.getRole();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        try {
            java.lang.Class<?> wildcardClass9 = address8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.util.List<java.lang.String> strList9 = employee0.getCities();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        employee0.setRole("2.5");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.journaldev.jackson.json.JacksonObjectMapperExample jacksonObjectMapperExample0 = new com.journaldev.jackson.json.JacksonObjectMapperExample();
        java.lang.String[] strArray3 = new java.lang.String[] { "2.5", "" };
        try {
            jacksonObjectMapperExample0.mainic(strArray3);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: employee.txt");
        } catch (java.nio.file.NoSuchFileException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        com.journaldev.jackson.model.Address address1 = null;
        employee0.setAddress(address1);
        try {
            java.lang.String str3 = employee0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        java.util.List<java.lang.String> strList9 = employee0.getCities();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.journaldev.jackson.model.Employee employee0 = com.journaldev.jackson.json.JacksonObjectMapperExample.createEmployee();
        java.lang.String str1 = employee0.toString();
        org.junit.Assert.assertNotNull(employee0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "***** Employee Details *****\nID=100\nName=David\nPermanent=false\nRole=Manager\nPhone Numbers=[123456, 987654]\nAddress=BTM 1st Stage, Bangalore, 560100\nCities=[Los Angeles, New York]\nProperties={salary=1000 Rs, age=28 years}\n*****************************" + "'", str1.equals("***** Employee Details *****\nID=100\nName=David\nPermanent=false\nRole=Manager\nPhone Numbers=[123456, 987654]\nAddress=BTM 1st Stage, Bangalore, 560100\nCities=[Los Angeles, New York]\nProperties={salary=1000 Rs, age=28 years}\n*****************************"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.journaldev.jackson.json.JacksonObjectMapperExample jacksonObjectMapperExample0 = new com.journaldev.jackson.json.JacksonObjectMapperExample();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        try {
            jacksonObjectMapperExample0.mainic(strArray5);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: employee.txt");
        } catch (java.nio.file.NoSuchFileException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.journaldev.jackson.model.Employee employee0 = com.journaldev.jackson.json.JacksonObjectMapperExample.createEmployee();
        int int1 = employee0.getId();
        org.junit.Assert.assertNotNull(employee0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.lang.Class<?> wildcardClass9 = employee0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        employee0.setProperties(strMap9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        employee0.setId((int) (byte) 100);
        com.journaldev.jackson.model.Address address4 = employee0.getAddress();
        com.journaldev.jackson.model.Address address5 = employee0.getAddress();
        java.lang.String str6 = employee0.getName();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        int int1 = address0.getZipcode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        employee0.setName("");
        boolean boolean10 = employee0.isPermanent();
        java.lang.String str11 = employee0.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "***** Employee Details *****\nID=0\nName=\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************" + "'", str11.equals("***** Employee Details *****\nID=0\nName=\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = employee0.getProperties();
        com.journaldev.jackson.model.Address address10 = new com.journaldev.jackson.model.Address();
        java.lang.String str11 = address10.getStreet();
        java.lang.String str12 = address10.getCity();
        java.lang.String str14 = address10.squareOfToString((java.lang.Integer) (-1));
        employee0.setAddress(address10);
        employee0.setName("");
        employee0.setRole("***** Employee Details *****\nID=100\nName=David\nPermanent=false\nRole=Manager\nPhone Numbers=[123456, 987654]\nAddress=BTM 1st Stage, Bangalore, 560100\nCities=[Los Angeles, New York]\nProperties={salary=1000 Rs, age=28 years}\n*****************************");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2.5" + "'", str14.equals("2.5"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String str1 = employee0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        java.lang.String str2 = employee0.getRole();
        employee0.setRole("");
        java.lang.String str5 = employee0.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = employee0.getProperties();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        address0.setCity("2.5");
        address0.setCity("2.5");
        java.lang.String str9 = address0.getCity();
        java.lang.String str11 = address0.squareOfToString((java.lang.Integer) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2.5" + "'", str9.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2.5" + "'", str11.equals("2.5"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        employee0.setProperties(strMap9);
        java.lang.String str11 = employee0.getRole();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        employee0.setName("");
        com.journaldev.jackson.model.Address address10 = employee0.getAddress();
        java.lang.String str11 = employee0.getName();
        long[] longArray12 = employee0.getPhoneNumbers();
        int int13 = employee0.getId();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(longArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        address0.setCity("2.5");
        java.lang.String str7 = address0.toString();
        address0.setZipcode((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null, 2.5, 0" + "'", str7.equals("null, 2.5, 0"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = employee0.getProperties();
        com.journaldev.jackson.model.Address address10 = new com.journaldev.jackson.model.Address();
        java.lang.String str11 = address10.getStreet();
        java.lang.String str12 = address10.getCity();
        java.lang.String str14 = address10.squareOfToString((java.lang.Integer) (-1));
        employee0.setAddress(address10);
        int int16 = address10.getZipcode();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2.5" + "'", str14.equals("2.5"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.lang.String str9 = employee0.getName();
        long[] longArray10 = employee0.getPhoneNumbers();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(longArray10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        java.lang.String str6 = address0.squareOfToString((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.5" + "'", str6.equals("2.5"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        address0.setCity("2.5");
        address0.setCity("2.5");
        java.lang.String str9 = address0.getCity();
        java.lang.String str10 = address0.getCity();
        java.lang.String str11 = address0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2.5" + "'", str9.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2.5" + "'", str10.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2.5" + "'", str11.equals("2.5"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        com.journaldev.jackson.model.Address address8 = employee0.getAddress();
        java.lang.String str9 = employee0.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "***** Employee Details *****\nID=0\nName=null\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************" + "'", str9.equals("***** Employee Details *****\nID=0\nName=null\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        employee0.setName("");
        boolean boolean10 = employee0.isPermanent();
        java.lang.String str11 = employee0.getRole();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        int int9 = employee0.getId();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        employee0.setPermanent(false);
        java.lang.String str9 = employee0.getName();
        java.util.List<java.lang.String> strList10 = employee0.getCities();
        java.lang.String str11 = employee0.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "***** Employee Details *****\nID=0\nName=null\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************" + "'", str11.equals("***** Employee Details *****\nID=0\nName=null\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        java.lang.String str2 = employee0.getRole();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = employee0.getProperties();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        java.lang.String str6 = address0.squareOfToString((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.5" + "'", str6.equals("2.5"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        employee0.setName("");
        com.journaldev.jackson.model.Address address10 = employee0.getAddress();
        java.lang.String[] strArray14 = new java.lang.String[] { "***** Employee Details *****\nID=100\nName=David\nPermanent=false\nRole=Manager\nPhone Numbers=[123456, 987654]\nAddress=BTM 1st Stage, Bangalore, 560100\nCities=[Los Angeles, New York]\nProperties={salary=1000 Rs, age=28 years}\n*****************************", "2.5", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        employee0.setCities((java.util.List<java.lang.String>) strList15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        employee0.setId((int) (byte) 100);
        com.journaldev.jackson.model.Address address4 = employee0.getAddress();
        java.util.List<java.lang.String> strList5 = employee0.getCities();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = employee0.getName();
        employee0.setName("");
        com.journaldev.jackson.model.Address address10 = employee0.getAddress();
        java.lang.String str11 = employee0.toString();
        employee0.setName("2.5");
        com.journaldev.jackson.model.Address address14 = new com.journaldev.jackson.model.Address();
        java.lang.String str15 = address14.getStreet();
        java.lang.String str16 = address14.getCity();
        java.lang.String str18 = address14.squareOfToString((java.lang.Integer) (-1));
        address14.setCity("2.5");
        employee0.setAddress(address14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "***** Employee Details *****\nID=0\nName=\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************" + "'", str11.equals("***** Employee Details *****\nID=0\nName=\nPermanent=false\nRole=null\nPhone Numbers=null\nAddress=null\nCities=[hi!, ]\nProperties=null\n*****************************"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "2.5" + "'", str18.equals("2.5"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str2 = address0.squareOfToString((java.lang.Integer) 1);
        address0.setStreet("");
        java.lang.String str6 = address0.squareOfToString((java.lang.Integer) 100);
        java.lang.String str7 = address0.toString();
        java.lang.String str8 = address0.getStreet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.5" + "'", str2.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.5" + "'", str6.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ", null, 0" + "'", str7.equals(", null, 0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.journaldev.jackson.model.Address address0 = new com.journaldev.jackson.model.Address();
        java.lang.String str1 = address0.getStreet();
        java.lang.String str2 = address0.getCity();
        java.lang.String str4 = address0.squareOfToString((java.lang.Integer) (-1));
        address0.setCity("2.5");
        java.lang.String str7 = address0.toString();
        java.lang.String str8 = address0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.5" + "'", str4.equals("2.5"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null, 2.5, 0" + "'", str7.equals("null, 2.5, 0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null, 2.5, 0" + "'", str8.equals("null, 2.5, 0"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        employee0.setCities((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.String> strList7 = employee0.getCities();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = employee0.getProperties();
        com.journaldev.jackson.model.Address address9 = employee0.getAddress();
        int int10 = employee0.getId();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        com.journaldev.jackson.model.Address address1 = null;
        employee0.setAddress(address1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = employee0.getProperties();
        int int4 = employee0.getId();
        boolean boolean5 = employee0.isPermanent();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        java.lang.String str2 = employee0.getRole();
        employee0.setRole("");
        boolean boolean5 = employee0.isPermanent();
        long[] longArray11 = new long[] { (short) 1, (short) 0, 100L, 0L, (short) 0 };
        employee0.setPhoneNumbers(longArray11);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray11);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = employee0.getProperties();
        employee0.setId(10);
        employee0.setId((int) (short) 100);
        org.junit.Assert.assertNull(strMap1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.journaldev.jackson.model.Employee employee0 = new com.journaldev.jackson.model.Employee();
        int int1 = employee0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

