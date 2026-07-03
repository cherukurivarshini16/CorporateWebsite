// ================================
// Corporate Website JavaScript
// ================================

console.log("ABC Technologies Website Loaded Successfully");

// Wait until page loads
document.addEventListener("DOMContentLoaded", () => {

    const contactForm = document.getElementById("contactForm");

    // Contact page only
    if (contactForm) {

        contactForm.addEventListener("submit", async function (event) {

            event.preventDefault();

            const contact = {

                name: document.getElementById("name").value,

                email: document.getElementById("email").value,

                phone: document.getElementById("phone").value,

                message: document.getElementById("message").value

            };

            try {

                const response = await fetch("http://localhost:8081/contacts", {

                    method: "POST",

                    headers: {

                        "Content-Type": "application/json"

                    },

                    body: JSON.stringify(contact)

                });

                const result = await response.text();

                alert(result);

                contactForm.reset();

            } catch (error) {

                alert("Unable to connect to the server.");

                console.error(error);

            }

        });

    }

});