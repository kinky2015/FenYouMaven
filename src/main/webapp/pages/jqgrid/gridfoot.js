var mydata = [
        { id: "1", country: "USA", state: "Texas",      city: "Houston",       attraction: "NASA",               zip: "77058", attr: {country: {rowspan: "5"},    state: {rowspan: "5"}} },
        { id: "2", country: "USA", state: "Texas",      city: "Houston",        attraction: "6th street",         zip: "78704", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "3", country: "USA", state: "Texas",      city: "Arlinton",      attraction: "Cowboys Stadium",    zip: "76011", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "4", country: "USA", state: "Texas",      city: "Plano",         attraction: "XYZ place",          zip: "54643", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "5", country: "USA", state: "Texas",      city: "Dallas",        attraction: "Reunion tower",      zip: "12323", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "6", country: "USA", state: "California", city: "Los Angeles",   attraction: "Hollywood",          zip: "65456", attr: {country: {rowspan: "4"},    state: {rowspan: "4"}} },
        { id: "7", country: "USA", state: "California", city: "San Francisco", attraction: "Golden Gate bridge", zip: "94129", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "8", country: "USA", state: "California", city: "San Diego",     attraction: "See world",          zip: "56653", attr: {country: {display: "none"}, state: {display: "none"}} },
        { id: "9", country: "USA", state: "California", city: "Anaheim",       attraction: "Disneyworld",        zip: "92802", attr: {country: {display: "none"}, state: {display: "none"}} }
    ],
    arrtSetting = function (rowId, val, rawObject, cm) {
        var attr = rawObject.attr[cm.name], result;
        if (attr.rowspan) {
            result = ' rowspan=' + '"' + attr.rowspan + '"';
        } else if (attr.display) {
            result = ' style="display:' + attr.display + '"';
        }
        return result;
    };
$(document).ready(function () {
$("#jqGrid").jqGrid({
    datatype: 'local',
    data: mydata,
    colNames: ['Country', 'State', 'City', 'Attraction', 'Zip code'],
    colModel: [
        { name: 'country', width: 70, align: 'center', cellattr: arrtSetting },
        { name: 'state', width: 80, align: 'center', cellattr: arrtSetting },
        { name: 'city', width: 90 },
        { name: 'attraction', width: 120 },
        { name: 'zip', index: 'tax', width: 60, align: 'right' }
    ],
    cmTemplate: {sortable: false},
    rowNum: 100,
    gridview: true,
    hoverrows: false,
    autoencode: true,
    ignoreCase: true,
    viewrecords: true,
    height: '100%',
    caption: 'Grid with rowSpan attributes',
    beforeSelectRow: function () {
        return false;
    }
});

//$('#grid).datagrid("autoMergeCells", ['field1', 'field2','field3',……]);

});