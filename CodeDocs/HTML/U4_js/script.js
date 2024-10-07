function calculateTotal() {
    let totalAmount = 0;

    // Check if each checkbox is selected and add its value to the total
    if (document.getElementById("item1").checked) {
        totalAmount += parseInt(document.getElementById("item1").value);
    }
    if (document.getElementById("item2").checked) {
        totalAmount += parseInt(document.getElementById("item2").value);
    }
    if (document.getElementById("item3").checked) {
        totalAmount += parseInt(document.getElementById("item3").value);
    }

    // Update the innerHTML of the totalAmount span with the calculated total
    document.getElementById("totalAmount").innerHTML = totalAmount;
}
