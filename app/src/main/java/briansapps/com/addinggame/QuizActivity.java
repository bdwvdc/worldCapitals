package briansapps.com.addinggame;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {


    Button button1, button2, button3, button4, button5, button6;

    TextView question;

    public Questions mQuestions = new Questions();
    public String mAnswer;
    public int mQuestionLength = mQuestions.mQuestions.length;

    Random r, randomA, randomB, randomC, randomD, randomE, random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        question = (TextView) findViewById(R.id.questions);
        r = new Random();

     ;
        final int randomA = new Random().nextInt(196);
        final int randomB = new Random().nextInt(196);
        final int randomC = new Random().nextInt(196);
        final int randomD = new Random().nextInt(196);
        final int mAnswer = new Random().nextInt(196);

        String mChoices[] = {

                "KABUL",
                "TIRANA",
                "ALGIERS",
                "ANDORRA LA VELLA",
                "LUANDA",
                "SAINT JOHN'S",
                "BUENOS AIRES",
                "YEREVAN",
                "CANBERRA",
                "VIENNA",
                "BAKU",
                "NASSAU",
                "MANAMA",
                "DHAKA",
                "BRIDGETOWN",
                "MINSK",
                "BRUSSELS",
                "BELMOPAN",
                "PORTO-NOVO",
                "THIMPHU",
                "SUCRE",
                "SARAJEVO",
                "GABORONE",
                "BRASILIA",
                "BANDAR SERI BEGAWAN",
                "SOFIA",
                "OUAGADOUGOU",
                "BUJUMBURA",
                "PRAIA",
                "PHNOM PENH",
                "YAOUNDE",
                "OTTAWA",
                "BANGUI",
                "N'DJAMENA",
                "SANTIAGO",
                "BEIJING",
                "BOGOTÁ",
                "MORONI",
                "KINSHASA",
                "SAN JOSE",
                "YAMOUSSOUKRO",
                "ZAGREB",
                "HAVANA",
                "NICOSIA",
                "PRAGUE",
                "COPENHAGEN",
                "DJIBOUTI (CITY)",
                "ROSEAU",
                "SANTO DOMINGO",
                "QUITO",
                "CAIRO",
                "SAN SALVADOR",
                "MALABO",
                "ASMARA",
                "TALLINN",
                "MBABANE",
                "ADDIS ABABA",
                "PALIKIR",
                "SUVA",
                "HELSINKI",
                "PARIS",
                "LIBREVILLE",
                "BANJUL",
                "TBILISI",
                "BERLIN",
                "ACCRA",
                "ATHENS",
                "SAINT GEORGE'S",
                "GUATEMALA CITY",
                "CONAKRY",
                "BISSAU",
                "GEORGETOWN",
                "PORT-AU-PRINCE",
                "TEGUCIGALPA",
                "BUDAPEST",
                "REYKJAVIK",
                "NEW DELHI",
                "JAKARTA",
                "TEHRAN",
                "BAGHDAD",
                "DUBLIN",
                "JERUSALEM, TEL AVIV",
                "ROME",
                "KINGSTON",
                "TOKYO",
                "AMMAN",
                "ASTANA",
                "NAIROBI",
                "SOUTH TARAWA",
                "PRISTINA",
                "KUWAIT CITY",
                "BISHKEK",
                "VIENTIANE",
                "RIGA",
                "BEIRUT",
                "MASERU",
                "MONROVIA",
                "TRIPOLI",
                "VADUZ",
                "VILNIUS",
                "LUXEMBOURG",
                "SKOPJE",
                "ANTANANARIVO",
                "LILONGWE",
                "KUALA LUMPUR",
                "MALE",
                "BAMAKO",
                "VALLETTA",
                "MAJURO",
                "NOUAKCHOTT",
                "PORT LOUIS",
                "MEXICO CITY",
                "CHISINAU",
                "MONACO",
                "ULAANBAATAR",
                "PODGORICA",
                "RABAT",
                "MAPUTO",
                "NAY PYI TAW",
                "WINDHOEK",
                "YAREN DISTRICT",
                "KATHMANDU",
                "AMSTERDAM",
                "WELLINGTON",
                "MANAGUA",
                "NIAMEY",
                "ABUJA",
                "PYONGYANG",
                "OSLO",
                "MUSCAT",
                "ISLAMABAD",
                "NGERULMUD",
                "JERUSALEM, RAMALLAH",
                "PANAMA CITY",
                "PORT MORESBY",
                "ASUNCIÓN",
                "LIMA",
                "MANILA",
                "WARSAW",
                "LISBON",
                "DOHA",
                "BRAZZAVILLE",
                "BUCHAREST",
                "MOSCOW",
                "KIGALI",
                "BASSETERRE",
                "CASTRIES",
                "KINGSTOWN",
                "APIA",
                "SAN MARINO",
                "SÃO TOMÉ",
                "RIYADH",
                "DAKAR",
                "BELGRADE",
                "VICTORIA",
                "FREETOWN",
                "SINGAPORE",
                "BRATISLAVA",
                "LJUBLJANA",
                "HONIARA",
                "MOGADISHU",
                "BLOEMFONTEIN, CAPE TOWN, PRETORIA",
                "SEOUL",
                "JUBA",
                "MADRID",
                "COLOMBO, SRI JAYAWARDENEPURA KOTTE",
                "KHARTOUM",
                "PARAMARIBO",
                "STOCKHOLM",
                "BERN",
                "DAMASCUS",
                "DUSHANBE",
                "DODOMA",
                "BANGKOK",
                "DILI",
                "LOMÉ",
                "NUKUʻALOFA",
                "PORT OF SPAIN",
                "TUNIS",
                "ANKARA",
                "ASHGABAT",
                "FUNAFUTI",
                "KAMPALA",
                "KIEV",
                "ABU DHABI",
                "LONDON",
                "WASHINGTON, D.C.",
                "MONTEVIDEO",
                "TASHKENT",
                "PORT VILA",
                "VATICAN CITY",
                "CARACAS",
                "HANOI",
                "SANA'A",
                "LUSAKA",
                "HARARE",
                "ZIMBABWE",

        };

        String mCountries [] = {

                "AFGHANISTAN",
                "ALBANIA",
                "ALGERIA",
                "ANDORRA",
                "ANGOLA",
                "ANTIGUA & BARBUDA",
                "ARGENTINA",
                "ARMENIA",
                "AUSTRALIA",
                "AUSTRIA",
                "AZERBAIJAN",
                "BAHAMAS, THE",
                "BAHRAIN",
                "BANGLADESH",
                "BARBADOS",
                "BELARUS",
                "BELGIUM",
                "BELIZE",
                "BENIN",
                "BHUTAN",
                "BOLIVIA",
                "BOSNIA & HERZEGOVINA",
                "BOTSWANA",
                "BRAZIL",
                "BRUNEI",
                "BULGARIA",
                "BURKINA FASO",
                "BURUNDI",
                "CABO VERDE",
                "CAMBODIA",
                "CAMEROON",
                "CANADA",
                "CENTRAL AFRICAN REPUBLIC",
                "CHAD",
                "CHILE",
                "CHINA",
                "COLOMBIA",
                "COMOROS",
                "CONGO, DEMOCRATIC REPUBLIC OF THE",
                "COSTA RICA",
                "CÔTE D'IVOIRE",
                "CROATIA",
                "CUBA",
                "CYPRUS",
                "CZECH REPUBLIC",
                "DENMARK",
                "DJIBOUTI",
                "DOMINICA",
                "DOMINICAN REPUBLIC",
                "ECUADOR",
                "EGYPT",
                "EL SALVADOR",
                "EQUATORIAL GUINEA",
                "ERITREA",
                "ESTONIA",
                "ESWATINI",
                "ETHIOPIA",
                "FEDERATED STATES OF MICRONESIA",
                "FIJI",
                "FINLAND",
                "FRANCE",
                "GABON",
                "GAMBIA, THE",
                "GEORGIA",
                "GERMANY",
                "GHANA",
                "GREECE",
                "GRENADA",
                "GUATEMALA",
                "GUINEA",
                "GUINEA-BISSAU",
                "GUYANA",
                "HAITI",
                "HONDURAS",
                "HUNGARY",
                "ICELAND",
                "INDIA",
                "INDONESIA",
                "IRAN",
                "IRAQ",
                "IRELAND",
                "ISRAEL",
                "ITALY",
                "JAMAICA",
                "JAPAN",
                "JORDAN",
                "KAZAKHSTAN",
                "KENYA",
                "KIRIBATI",
                "KOSOVO",
                "KUWAIT",
                "KYRGYZSTAN",
                "LAOS",
                "LATVIA",
                "LEBANON",
                "LESOTHO",
                "LIBERIA",
                "LIBYA",
                "LIECHTENSTEIN",
                "LITHUANIA",
                "LUXEMBOURG",
                "MACEDONIA",
                "MADAGASCAR",
                "MALAWI",
                "MALAYSIA",
                "MALDIVES",
                "MALI",
                "MALTA",
                "MARSHALL ISLANDS",
                "MAURITANIA",
                "MAURITIUS",
                "MEXICO",
                "MOLDOVA",
                "MONACO",
                "MONGOLIA",
                "MONTENEGRO",
                "MOROCCO",
                "MOZAMBIQUE",
                "MYANMAR",
                "NAMIBIA",
                "NAURU",
                "NEPAL",
                "NETHERLANDS",
                "NEW ZEALAND",
                "NICARAGUA",
                "NIGER",
                "NIGERIA",
                "NORTH KOREA",
                "NORWAY",
                "OMAN",
                "PAKISTAN",
                "PALAU",
                "PALESTINE",
                "PANAMA",
                "PAPUA NEW GUINEA",
                "PARAGUAY",
                "PERU",
                "PHILIPPINES",
                "POLAND",
                "PORTUGAL",
                "QATAR",
                "REPUBLIC OF THE CONGO",
                "ROMANIA",
                "RUSSIA",
                "RWANDA",
                "SAINT KITTS & NEVIS",
                "SAINT LUCIA",
                "SAINT VINCENT & THE GRENADINES",
                "SAMOA",
                "SAN MARINO",
                "SÃO TOMÉ & PRÍNCIPE",
                "SAUDI ARABIA",
                "SENEGAL",
                "SERBIA",
                "SEYCHELLES",
                "SIERRA LEONE",
                "SINGAPORE",
                "SLOVAKIA",
                "SLOVENIA",
                "SOLOMON ISLANDS",
                "SOMALIA",
                "SOUTH AFRICA",
                "SOUTH KOREA",
                "SOUTH SUDAN",
                "SPAIN",
                "SRI LANKA",
                "SUDAN",
                "SURINAME",
                "SWEDEN",
                "SWITZERLAND",
                "SYRIA",
                "TAJIKISTAN",
                "TANZANIA",
                "THAILAND",
                "TIMOR-LESTE",
                "TOGO",
                "TONGA",
                "TRINIDAD & TOBAGO",
                "TUNISIA",
                "TURKEY",
                "TURKMENISTAN",
                "TUVALU",
                "UGANDA",
                "UKRAINE",
                "UNITED ARAB EMIRATES",
                "UNITED KINGDOM",
                "UNITED STATES",
                "URUGUAY",
                "UZBEKISTAN",
                "VANUATU",
                "VATICAN CITY",
                "VENEZUELA",
                "VIETNAM",
                "YEMEN",
                "ZAMBIA",
                "ZIMBABWE"

        };


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button6.setText(mCountries[mAnswer]);
        button1.setText(mChoices[randomA]);
        button2.setText(mChoices[randomB]);
        button3.setText(mChoices[randomC]);
        button4.setText(mChoices[randomD]);
        button5.setText(mChoices[mAnswer]);

        Button button_click1 = findViewById(R.id.button1);
        button_click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice_1();

            }
        });

        Button button_click2 = findViewById(R.id.button2);
        button_click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice_2();

            }
        });

        Button button_click3 = findViewById(R.id.button3);
        button_click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice_3();

            }
        });

        Button button_click4 = findViewById(R.id.button4);
        button_click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice_4();

            }
        });

        Button button_click5 = findViewById(R.id.button5);
        button_click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choice_5();

            }
        });





    }




    private void Choice_1() {
        Intent intent = new Intent(this, Choice_1.class);
        startActivity(intent);
    }
    private void Choice_2() {
        Intent intent = new Intent(this, Choice_2.class);
        startActivity(intent);
    }
    private void Choice_3() {
        Intent intent = new Intent(this, Choice_3.class);
        startActivity(intent);
    }
    private void Choice_4() {
        Intent intent = new Intent(this, Choice_4.class);
        startActivity(intent);
    }
    private void Choice_5() {
        Intent intent = new Intent(this, Choice_5.class);
        startActivity(intent);
    }
}