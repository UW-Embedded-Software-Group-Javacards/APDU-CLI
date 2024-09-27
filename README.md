# APDU-CLI: Command-Line Interface for Smart Card Interaction

**APDU-CLI** is a key component of an ongoing research project by Krish Shah and Dieter Whittingham at the University of Waterloo's Embedded Software Group, supervised by Dr. Sebastian Fischmeister. This lightweight command-line tool aims to facilitate communication with smart cards, contributing to the exploration of embedded systems.

## Project Highlights

- **APDU Communication**: Simplifies the process of sending and receiving Application Protocol Data Units (APDUs) for smart card interactions.
- **User-Friendly Design**: Offers an intuitive command-line interface to enhance usability.
- **Part of a Larger Initiative**: Integrates with broader research efforts in embedded software technology.

APDU-CLI serves as a practical tool within this research project, helping to advance understanding in the field of smart card technology. We invite you to explore its capabilities as part of our ongoing work!

## Running the project

#### Compilation

```bash
mvn compile
```

#### Running the application

```bash
mvn exec:java
```

#### Commands

ping - check if the card is detected and if a valid protocol is established

read - reads the entire data on the card, -o: given a filename, reads data from the file

write - write data to a card (binary, text) -o: write data to a file (-f overwrites the entire card)

config - manages the config for a card (read, edit) (protocol, id, etc)

