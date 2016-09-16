// Morris.js Charts sample data for SB Admin template

$(function() {

    // Area Chart
    Morris.Area({
        element: 'morris-area-chart',
        data: [{
            period: '2015 Q1',
            iphone: 2666,
          
        }, {
            period: '2015 Q2',
            iphone: 2778,
         
        }, {
            period: '2015 Q3',
            iphone: 4912,
       
        }, {
            period: '2015 Q4',
            iphone: 3767,
          
        }, {
            period: '2015 Q5',
            iphone: 6810,
        
        }, {
            period: '2015 Q6',
            iphone: 5670,
         
        }, {
            period: '2015 Q7',
            iphone: 4820,
        
        
        }],
        xkey: 'period',
        ykeys: ['iphone'],
        
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });

    // Donut Chart
    Morris.Donut({
        element: 'morris-donut-chart',
        data: [{
            label: "New Comments",
            value: 26
        }, {
            label: "New Members",
            value: 12
        }, {
            label: "New Orders",
            value: 30
        }],
        resize: true
    });
    
});
