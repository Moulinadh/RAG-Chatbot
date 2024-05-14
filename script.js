function sendMessage() {
    var userInput = document.getElementById("user-input").value;
    // Send user message to the backend for processing
    // Update chat display with response from the backend
    document.getElementById("user-input").value = "";
}

document.getElementById("upload-form").addEventListener("submit", function(event) {
    event.preventDefault();
    var fileInput = document.getElementById('file');
    var file = fileInput.files[0];
    // Send file to the backend for uploading
    // Display success message or handle errors
});
