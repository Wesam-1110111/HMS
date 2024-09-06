import java.util.Scanner;
public class HMS2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        // ======= varibls =====
        int home_menu,sub_menu,set_menu,get_menu;
        int data;
        String sdata;
        // ===================
        // create objects
        House h1 = new House();
        House h2 = new House();
        House h3 = new House();
        //======================

        do // home menu
        {
            print_menu();
            home_menu = in.nextInt();
            switch(home_menu)
            {
                case 1: // house 1
                    do // sub menu
                    {
                        print_sub_menu();
                        sub_menu = in.nextInt();
                        switch(sub_menu)
                        {
                            case 1: // set data
                                do
                                {
                                    print_set_menu();
                                    set_menu = in.nextInt();
                                    switch(set_menu)
                                    {
                                        case 1: // set length
                                            p("Please enter length :");
                                            data = in.nextInt();
                                            h1.set_length(data);
                                        break;
                                        case 2: // set width
                                            p("Please enter width :");
                                            data = in.nextInt();
                                            h1.set_width(data);
                                        break;
                                        case 3: // set hight
                                        p("Please enter hight :");
                                            data = in.nextInt();
                                            h1.set_hight(data);
                                        break;
                                        case 4: // set floors
                                        p("Please enter floors :");
                                            data = in.nextInt();
                                            h1.set_floors(data);
                                        break;
                                        case 5: // set rooms
                                        p("Please enter rooms :");
                                            data = in.nextInt();
                                            h1.set_rooms(data);
                                        break;
                                        case 6: // set bedrooms
                                        p("Please enter bedrooms :");
                                            data = in.nextInt();
                                            h1.set_bedrooms(data);
                                        break;
                                        case 7: // set bathrooms
                                        p("Please enter bathrooms :");
                                            data = in.nextInt();
                                            h1.set_bathrooms(data);
                                        break;
                                        case 8: // set color
                                        p("Please enter color :");
                                            sdata = in.next();
                                            h1.set_color(sdata);
                                        break;
                                        case 9: // set style
                                        p("Please enter style :");
                                            sdata = in.next();
                                            h1.set_style(sdata);
                                        break;
                                        case 10: // set price
                                        p("Please enter price :");
                                            data = in.nextInt();
                                            h1.set_price(data);
                                        break;
                                        case 11: // set address
                                        p("Please enter address :");
                                            data = in.nextInt();
                                            h1.set_address(data);
                                        break;
                                        case 0: // exit 
                                        break;
                                        default:
                                             p("There something went wrong, please try again.");
            
                                    }// end switch set menu 
                                }while(set_menu!=0); // end of do-while of set data
                            break;
                            case 2: // get data
                                do
                                {
                                    print_get_menu();
                                    get_menu = in.nextInt();
                                    switch(get_menu)
                                    {
                                        case 1: // get length
                                            p("The length = " + h1.get_length());
                                        break;
                                        case 2: // get width
                                            p("The width = " + h1.get_width());
                                        break;
                                        case 3: // get hight
                                            p("The hight = " + h1.get_hight());
                                        break;
                                        case 4: // get floors
                                            p("The floors = " + h1.get_floors());
                                        break;
                                        case 5: // get rooms
                                        p("The rooms = " + h1.get_rooms());
                                        break;
                                        case 6: // get bedrooms
                                        p("The bedrooms = " + h1.get_bedrooms());
                                        break;
                                        case 7: // get bathrooms
                                        p("The bathrooms = " + h1.get_bathrooms());
                                        break;
                                        case 8: // get color
                                        p("The color = " + h1.get_color());
                                        break;  
                                        case 9: // get style
                                        p("The style = " + h1.get_style());
                                        break;
                                        case 10: // get price
                                        p("The price = " + h1.get_price());
                                        break;
                                        case 11: // get area
                                        p("The area = " + h1.calc_area());
                                        break;
                                        case 12: // get count
                                        p("The count = " + h1.get_count());
                                        break;
                                        case 13: // get address
                                        p("The address = " + h1.get_address());
                                        break;
                                        case 14: // get display home info
                                        h1.display_house_info();
                                        break;
                                        case 0: // exit
                                        break;
                                        
                                        default:
                                             p("There something went wrong, please try again.");

                                    }// end switch of get data

                                }while(get_menu!=0); // end do-while of get data
                            break;
                            case 0: // exit
                            break;
                            default:
                            p("There something went wrong, please try again.");

                        } // end switch of sub menu
                    }while(sub_menu!=0); // end do-while of sub menu
                break;
                case 2: // house 2
                do // sub menu
                {
                    print_sub_menu();
                    sub_menu = in.nextInt();
                    switch(sub_menu)
                    {
                        case 1: // set data
                            do
                            {
                                print_set_menu();
                                set_menu = in.nextInt();
                                switch(set_menu)
                                {
                                    case 1: // set length
                                        p("Please enter length :");
                                        data = in.nextInt();
                                        h2.set_length(data);
                                    break;
                                    case 2: // set width
                                        p("Please enter width :");
                                        data = in.nextInt();
                                        h2.set_width(data);
                                    break;
                                    case 3: // set hight
                                    p("Please enter hight :");
                                        data = in.nextInt();
                                        h2.set_hight(data);
                                    break;
                                    case 4: // set floors
                                    p("Please enter floors :");
                                        data = in.nextInt();
                                        h2.set_floors(data);
                                    break;
                                    case 5: // set rooms
                                    p("Please enter rooms :");
                                        data = in.nextInt();
                                        h2.set_rooms(data);
                                    break;
                                    case 6: // set bedrooms
                                    p("Please enter bedrooms :");
                                        data = in.nextInt();
                                        h2.set_bedrooms(data);
                                    break;
                                    case 7: // set bathrooms
                                    p("Please enter bathrooms :");
                                        data = in.nextInt();
                                        h2.set_bathrooms(data);
                                    break;
                                    case 8: // set color
                                    p("Please enter color :");
                                        sdata = in.next();
                                        h2.set_color(sdata);
                                    break;
                                    case 9: // set style
                                    p("Please enter style :");
                                        sdata = in.next();
                                        h2.set_style(sdata);
                                    break;
                                    case 10: // set price
                                    p("Please enter price :");
                                        data = in.nextInt();
                                        h2.set_price(data);
                                    break;
                                    case 11: // set address
                                    p("Please enter address :");
                                        data = in.nextInt();
                                        h2.set_address(data);
                                    break;
                                    case 0: // exit 
                                    break;
                                    default:
                                         p("There something went wrong, please try again.");
        
                                }// end switch set menu 
                            }while(set_menu!=0); // end of do-while of set data
                        break;
                        case 2: // get data
                            do
                            {
                                print_get_menu();
                                get_menu = in.nextInt();
                                switch(get_menu)
                                {
                                    case 1: // get length
                                        p("The length = " + h2.get_length());
                                    break;
                                    case 2: // get width
                                        p("The width = " + h2.get_width());
                                    break;
                                    case 3: // get hight
                                        p("The hight = " + h2.get_hight());
                                    break;
                                    case 4: // get floors
                                        p("The floors = " + h2.get_floors());
                                    break;
                                    case 5: // get rooms
                                    p("The rooms = " + h2.get_rooms());
                                    break;
                                    case 6: // get bedrooms
                                    p("The bedrooms = " + h2.get_bedrooms());
                                    break;
                                    case 7: // get bathrooms
                                    p("The bathrooms = " + h2.get_bathrooms());
                                    break;
                                    case 8: // get color
                                    p("The color = " + h2.get_color());
                                    break;  
                                    case 9: // get style
                                    p("The style = " + h2.get_style());
                                    break;
                                    case 10: // get price
                                    p("The price = " + h2.get_price());
                                    break;
                                    case 11: // get area
                                    p("The area = " + h2.calc_area());
                                    break;
                                    case 12: // get count
                                    p("The count = " + h2.get_count());
                                    break;
                                    case 13: // get address
                                    p("The address = " + h2.get_address());
                                    break;
                                    case 14: // get display home info
                                    h2.display_house_info();
                                    break;
                                    case 0: // exit
                                    break;
                                    
                                    default:
                                         p("There something went wrong, please try again.");

                                }// end switch of get data

                            }while(get_menu!=0); // end do-while of get data
                        break;
                        case 0: // exit
                        break;
                        default:
                        p("There something went wrong, please try again.");

                    } // end switch of sub menu
                }while(sub_menu!=0); // end do-while of sub menu

                break;
                case 3: // house 3
                do // sub menu
                {
                    print_sub_menu();
                    sub_menu = in.nextInt();
                    switch(sub_menu)
                    {
                        case 1: // set data
                            do
                            {
                                print_set_menu();
                                set_menu = in.nextInt();
                                switch(set_menu)
                                {
                                    case 1: // set length
                                        p("Please enter length :");
                                        data = in.nextInt();
                                        h3.set_length(data);
                                    break;
                                    case 2: // set width
                                        p("Please enter width :");
                                        data = in.nextInt();
                                        h3.set_width(data);
                                    break;
                                    case 3: // set hight
                                    p("Please enter hight :");
                                        data = in.nextInt();
                                        h3.set_hight(data);
                                    break;
                                    case 4: // set floors
                                    p("Please enter floors :");
                                        data = in.nextInt();
                                        h3.set_floors(data);
                                    break;
                                    case 5: // set rooms
                                    p("Please enter rooms :");
                                        data = in.nextInt();
                                        h3.set_rooms(data);
                                    break;
                                    case 6: // set bedrooms
                                    p("Please enter bedrooms :");
                                        data = in.nextInt();
                                        h3.set_bedrooms(data);
                                    break;
                                    case 7: // set bathrooms
                                    p("Please enter bathrooms :");
                                        data = in.nextInt();
                                        h3.set_bathrooms(data);
                                    break;
                                    case 8: // set color
                                    p("Please enter color :");
                                        sdata = in.next();
                                        h3.set_color(sdata);
                                    break;
                                    case 9: // set style
                                    p("Please enter style :");
                                        sdata = in.next();
                                        h3.set_style(sdata);
                                    break;
                                    case 10: // set price
                                    p("Please enter price :");
                                        data = in.nextInt();
                                        h3.set_price(data);
                                    break;
                                    case 11: // set address
                                    p("Please enter address :");
                                        data = in.nextInt();
                                        h3.set_address(data);
                                    break;
                                    case 0: // exit 
                                    break;
                                    default:
                                         p("There something went wrong, please try again.");
        
                                }// end switch set menu 
                            }while(set_menu!=0); // end of do-while of set data
                        break;
                        case 2: // get data
                            do
                            {
                                print_get_menu();
                                get_menu = in.nextInt();
                                switch(get_menu)
                                {
                                    case 1: // get length
                                        p("The length = " + h3.get_length());
                                    break;
                                    case 2: // get width
                                        p("The width = " + h3.get_width());
                                    break;
                                    case 3: // get hight
                                        p("The hight = " + h3.get_hight());
                                    break;
                                    case 4: // get floors
                                        p("The floors = " + h3.get_floors());
                                    break;
                                    case 5: // get rooms
                                    p("The rooms = " + h3.get_rooms());
                                    break;
                                    case 6: // get bedrooms
                                    p("The bedrooms = " + h3.get_bedrooms());
                                    break;
                                    case 7: // get bathrooms
                                    p("The bathrooms = " + h3.get_bathrooms());
                                    break;
                                    case 8: // get color
                                    p("The color = " + h3.get_color());
                                    break;  
                                    case 9: // get style
                                    p("The style = " + h3.get_style());
                                    break;
                                    case 10: // get price
                                    p("The price = " + h3.get_price());
                                    break;
                                    case 11: // get area
                                    p("The area = " + h3.calc_area());
                                    break;
                                    case 12: // get count
                                    p("The count = " + h3.get_count());
                                    break;
                                    case 13: // get address
                                    p("The address = " + h3.get_address());
                                    break;
                                    case 14: // get display home info
                                    h3.display_house_info();
                                    break;
                                    case 0: // exit
                                    break;
                                    
                                    default:
                                         p("There something went wrong, please try again.");

                                }// end switch of get data

                            }while(get_menu!=0); // end do-while of get data
                        break;
                        case 0: // exit
                        break;
                        default:
                        p("There something went wrong, please try again.");

                    } // end switch of sub menu
                }while(sub_menu!=0); // end do-while of sub menu

                break;
                case 0: // exit
                break;

                default:
                p("There something went wrong, please try again.");

            } // end switch of home menu

        }while(home_menu!=0); // home menu



    } // end main

    public static void p(String x) // to print
    {
        System.out.println(x);
    }

    public static void print_stars() // to print line of stars
    {
        p("***********************************************");
    }

    public static void print_menu() // to print home menu
    {
        p("\n1) House no.1\n2) House no.2\n3) House no.3\n0) Exit.\n Please enter your choose : ");
    }

    public static void print_set_menu() // to print sets menu
    {
        print_stars();
        p("1) Set length.\n2) Set width.\n3) Set hight.\n4) Set floors.\n5) Set rooms.\n6) Set bedrooms\n7) Set bathrooms.\n8) Set color.\n9) Set Style.\n10) Set price.\n11) Set address.\n0) Exit.");
        p("Please enter your choose :  ");
        print_stars();
    }

    public static void print_get_menu() // to print gets menu
    {
        print_stars();
        
        p("1) Get length.\n2) Get width.\n3) Get hight.\n4) Get floors.\n5) Get rooms.\n6) Get bedrooms\n7) Get bathrooms.\n8) Get color.\n9) Get Style.\n10) Get price.\n11) Get area.\n12) Get count.\n13) Get address.\n14) Display house information.\n0) Exit.");
        p("Please enter your choose :  ");
       
        print_stars();
    }

    public static void print_sub_menu() // to print sub menu
    {
        p("Please choose one of them :\n1) Set Data.\n2) Get Data.\n0) Exit.\n Enter >>  ") ;   
    }
}

// ======================

class House
{
    private int length;
    private int width;
    private int hight;
    private int floors;
    private int rooms;
    private int bathrooms;
    private int bedrooms;
    private int price;
    private String color;
    private String style;
    private int area;
    private int address;
    static private int count=0;

    public House()
    {
        length = 10;
        width = 10;
        hight = 4;
        floors = 1;
        rooms = 1;
        bathrooms = 1;
        bedrooms = 1;
        price = 0;
        color = "White";
        style = "Modren";
        area = 100;
        address = 0;
        count ++;
    } 
    
    public void p(String x)
    {
        System.out.println(x);
    }

    public void ps()
    {
        p("***********************************************");
    }
    
    public void set_length(int l)
    {
        if(l>=10)
        {
            length = l;
        }
        else
            p("Please enter correct value.");
    }

    public int get_length()
    {
        return length;
    }

    public void set_width(int w)
    {
        if(w>=10)
        {
            width = w;
        }
        else
            p("Please enter correct value.");
    }

    public int get_width()
    {
        return width;
    }

    public void set_hight(int h)
    {
        if(h>=4)
        {
            hight = h;
        }
        else
            p("Please enter correct value.");
    }

    public int get_hight()
    {
        return hight;
    }

    public void set_floors(int f)
    {
        if(f>=1)
        {
            floors = f;
        }
        else
        {
            p("Please enter correct value.");
        }
    }

    public int get_floors()
    {
        return floors;
    }

    public void set_rooms(int r)
    {
        if(r>=1)
        {
        rooms = r;
        }
        else
        {
            p("Please enter correct value.");
        }
    }

    public int get_rooms()
    {
        return rooms;
    }

    public void set_bedrooms(int br)
    {
        if(br>=1)
        {
        bedrooms = br;
        }
        else
        {
            p("Please enter correct value.");
        }
    }

    public int get_bedrooms()
    {
        return bedrooms;
    }

    public void set_bathrooms(int btr)
    {
        if(btr>=1)
        {
        bathrooms = btr;
        }
        else
        {
            p("Please enter correct value.");
        }
    }

    public int get_bathrooms()
    {
        return bathrooms;
    }

    public void set_price(int p)
    {
        if(p>=9000)
        {
        price = p;
        }
        else
        {
            p("Please enter correct value.");
        }
    }

    public int get_price()
    {
        return price;
    }
    
    public void set_color(String c)
    {
        color = c;
    }

    public String get_color()
    {
        return color;
    }

    public void set_style(String s)
    {
        style = s;
    }

    public String get_style()
    {
        return style;
    }

    public int calc_area()
    {
        area = length * width;
        return area;
    }

    public int get_count()
    {
        return count;
    }

    public void set_address(int ad)
    {
        if(ad>0)
        {
            address = ad;
        }
        else
            p("Please enter correct value.");
    }

    public int get_address()
    {
        return address;
    }

    public void display_house_info()
    {
        ps();
        p("The house information : ");
        p("1. The length = m" + get_length());
        p("2. The width = m" + get_width());
        p("3. The hight = m" + get_hight());
        p("4. The area = m" + calc_area());
        p("5. The floors = " + get_floors());
        p("6. The rooms = " + get_rooms());
        p("7. The bedrooms = " + get_bedrooms());
        p("8. The bathrooms = " + get_bathrooms());
        p("9. The color = " + get_color());
        p("10. The style = " + get_style());
        p("11. The address = " + get_address());
        p("12. The price = $" + get_price());
        ps();
        p("\n");
    }
}
