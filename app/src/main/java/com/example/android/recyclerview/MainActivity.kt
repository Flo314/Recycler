package com.example.android.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // listes des pays
    var countries = arrayOf<String>("Afghanistan", "Albania","Algeria","American Samoa","AndorrA", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda","Argentina","Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium", "Belize", "Benin", "Bermuda","Bhutan","Bolivia", "Bosnia and Herzegovina","Botswana","Bouvet Island","Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso","Burundi","Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands","Central African Republic","Chad", "Chile","China","Christmas Island","Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo","Congo, The Democratic Republic of the", "Cook Islands", "Costa Rica","Côte D’Ivoire", "Croatia", "Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",  "Estonia",  "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji",  "Finland", "France", "French Guiana","French Polynesia",  "French Southern Territories", "Gabon", "Gambia","Georgia", "Germany", "Ghana",  "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and Mcdonald Islands",  "Holy See (Vatican City State)", "Honduras", "Hong Kong",  "Hungary",  "Iceland", "India", "Indonesia", "Iran, Islamic Republic Of", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey","Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea", "Democratic Republic", "Latvia",  "Lebanon","Lesotho", "Liberia", "Libyan Arab Jamahiriya",  "Liechtenstein", "Lithuania",  "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali","Malta","Marshall Islands",  "Martinique", "Mauritania", "Mauritius", "Mayotte","Mexico",  "Micronesia, Federated States of",  "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro",  "Montserrat", "Morocco", "Mozambique","Myanmar",  "Namibia",  "Nauru",  "Nepal", "Netherlands", "Netherlands Antilles",  "New Caledonia", "New Zealand",  "Nicaragua", "Niger", "Nigeria","Niue",  "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman","Pakistan",  "Palau",  "Palestinian Territory, Occupied", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn",  "Poland", "Portugal",  "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation",  "RWANDA", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia",  "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines","Samoa",  "San Marino",  "Sao Tome and Principe",  "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore",  "Slovakia",  "Slovenia",  "Solomon Islands", "Somalia", "South Africa","South Georgia and the South Sandwich Islands","Spain", "Sri Lanka","Sudan","Suri", "Svalbard and Jan Mayen","Swaziland","Sweden","Switzerland", "Syrian Arab Republic","Taiwan, Province of China", "Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tokelau","Tonga","Trinidad and Tobago","Tunisia", "Turkey","Turkmenistan","Turks and Caicos Islands","Tuvalu","Uganda","Ukraine","United Arab Emirates","United Kingdom","United States","United States Minor Outlying Islands","Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Virgin Islands, British","Virgin Islands")

    // déclarer l'adapteur
    val adapter = CountryAdapter(countries);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // récupérer le recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.countries_recycler_view);
        // indiquer la manière dont il doit faire le layout(LayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(this);
        // affecter l'adapter au recyclerVew
        recyclerView.adapter = adapter;

    }

}
