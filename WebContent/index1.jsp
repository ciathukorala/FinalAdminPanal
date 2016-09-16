<script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
$(document).ready(function()
{
$.ajax
({
type: "GET",
url: "GetSpace",
dataType:"json",
success: function(data)
{
if(data.Messages.length)
{
$.each(data.Messages, function(i,data)
{
var msg_data1="<div>"+i.Id+"</div>";
var msg_data2="<div>"+data.Name+"</div>";
var msg_data3="<div>"+data.PhoneNumber+"</div>";
var msg_data4="<div>"+data.Address+"</div>";
var msg_data5="<div>"+data.slots+"</div>";
var msg_data6="<div>"+data.Description+"</div>";
var msg_data7="<div>"+data.Instruction+"</div>";
var msg_data8="<div>"+data.price+"</div>";
$(msg_data1).appendTo("#Space1");
$(msg_data2).appendTo("#Space2");
$(msg_data3).appendTo("#Space3");
$(msg_data4).appendTo("#Space4");
$(msg_data5).appendTo("#Space5");
$(msg_data6).appendTo("#Space6");
$(msg_data7).appendTo("#Space7");
$(msg_data8).appendTo("#Space8");

});
}

}
});

});

</script>
<table>
<tr><td><div id='Space1'></div></td><td><div id='Space2'></div></td></tr>
</table>

<!-- Large modal -->
<button class="btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-lg">Large modal</button>

<div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      ...
    </div>
  </div>
</div>

<!-- Small modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-sm">Small modal</button>

<div class="modal fade bd-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
      ...
    </div>
  </div>
</div>

